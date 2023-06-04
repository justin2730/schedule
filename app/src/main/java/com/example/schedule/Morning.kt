package com.example.schedule

import android.Manifest
import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStream
import kotlin.math.min

class Morning : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var btn_random: Button
    private lateinit var btn_download: Button

    private val WRITE_STORAGE_PERMISSION_REQUEST_CODE = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.morning)

        imageView = findViewById(R.id.imageView)
        btn_random = findViewById(R.id.btn_random)
        btn_download = findViewById(R.id.btn_download)

        // 設定按鈕點擊事件
        btn_random.setOnClickListener {
            displayRandomImage()
        }

        btn_download.setOnClickListener {
            val selectedResourceId = imageView.getTag(R.id.selected_image_resource_id) as Int?
            if (selectedResourceId != null) {
                if (checkWriteStoragePermission()) {
                    downloadImage(selectedResourceId)
                } else {
                    requestWriteStoragePermission()
                }
            } else {
                Toast.makeText(this, "No image selected.", Toast.LENGTH_SHORT).show()
            }
        }

        // 檢查權限
        checkWriteStoragePermission()
        // 初始化顯示一張圖片
        displayRandomImage()
    }

    private fun displayRandomImage() {
        val imageResourceIds = mutableListOf<Int>()
        // 获取所有图片的资源 ID
        for (resId in 1..500) {
            val resourceName = "img_$resId"
            val resourceId = resources.getIdentifier(resourceName, "drawable", packageName)
            if (resourceId != 0) {
                imageResourceIds.add(resourceId)
            }
        }

        // 随机选择一个图片资源 ID
        if (imageResourceIds.isNotEmpty()) {
            val randomIndex = (0 until imageResourceIds.size).random()
            val selectedResourceId = imageResourceIds[randomIndex]

            // 获取原始图片的 Drawable
            val originalDrawable = ContextCompat.getDrawable(this, selectedResourceId)

            // 获取 ImageView 的尺寸
            val imageViewWidth = imageView.width
            val imageViewHeight = imageView.height

            // 调整图片大小
            val scaledDrawable = scaleDrawable(originalDrawable, imageViewWidth, imageViewHeight)

            // 设置调整大小后的图片到 ImageView
            imageView.setImageDrawable(scaledDrawable)
            imageView.setTag(R.id.selected_image_resource_id, selectedResourceId)
        } else {
            Toast.makeText(this, "No images found.", Toast.LENGTH_SHORT).show()
        }
    }

    private fun scaleDrawable(drawable: Drawable?, targetWidth: Int, targetHeight: Int): Drawable? {
        if (drawable == null) return null

        val originalWidth = drawable.intrinsicWidth
        val originalHeight = drawable.intrinsicHeight

        val scaleX = targetWidth.toFloat() / originalWidth
        val scaleY = targetHeight.toFloat() / originalHeight

        // 选择较小的缩放比例，以保持图片的长宽比例
        val scaleFactor = min(scaleX, scaleY)

        val scaledWidth = (originalWidth * scaleFactor).toInt()
        val scaledHeight = (originalHeight * scaleFactor).toInt()

        // 计算图片在 ImageView 内的位置
        val left = (targetWidth - scaledWidth) / 2
        val top = (targetHeight - scaledHeight) / 2
        val right = left + scaledWidth
        val bottom = top + scaledHeight

        drawable.setBounds(left, top, right, bottom)

        return drawable
    }

    private fun checkWriteStoragePermission(): Boolean {
        val permission = Manifest.permission.WRITE_EXTERNAL_STORAGE
        val result = ContextCompat.checkSelfPermission(this, permission)
        if (result == PackageManager.PERMISSION_GRANTED) {
            // 權限已授予
            return true
        }
        // 權限未授予
        return false
    }

    private fun requestWriteStoragePermission() {
        val permission = Manifest.permission.WRITE_EXTERNAL_STORAGE
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            ActivityCompat.requestPermissions(this, arrayOf(permission), WRITE_STORAGE_PERMISSION_REQUEST_CODE)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == WRITE_STORAGE_PERMISSION_REQUEST_CODE) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // 权限已授予，下载图片
                btn_download.performClick()
            } else {
                Toast.makeText(this, "無法下載圖片，未授予寫入儲存權限", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun downloadImage(resourceId: Int) {
        // 获取图片的 Drawable
        val drawable = ContextCompat.getDrawable(this, resourceId)
        // 将 Drawable 转换成 Bitmap
        val bitmap = (drawable as BitmapDrawable).bitmap

        // 设置图片文件名称
        val filename = "image_$resourceId.jpg"
        // 声明输出流变量
        val outputStream: OutputStream

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // 使用 MediaStore API 保存图片（适用于 Android 10 及以上版本）
            val contentValues = ContentValues().apply {
                put(MediaStore.MediaColumns.DISPLAY_NAME, filename)
                put(MediaStore.MediaColumns.MIME_TYPE, "image/jpeg")
                put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_PICTURES + File.separator + "早安圖")
            }
            // 插入图片信息到 MediaStore
            val imageUri = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues)
            // 获取图片的输出流
            outputStream = imageUri?.let { contentResolver.openOutputStream(it) }!!
        } else {
            // 保存图片到外部存储（适用于 Android 9 及以下版本）
            val imageDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES + File.separator + "早安圖")
            imageDir.mkdirs() // 创建目录（如果不存在）
            val imageFile = File(imageDir, filename)
            // 获取图片的输出流
            outputStream = FileOutputStream(imageFile)
        }

        // 压缩图片并写入输出流
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream)
        outputStream.flush()
        outputStream.close()

        // 显示下载成功的消息
        Toast.makeText(this, "下載成功", Toast.LENGTH_SHORT).show()
    }

    fun back_to_mainPage(view: View) {
        val intent = Intent(this,MainActivity ::class.java )
        startActivity(intent)
    }
}
