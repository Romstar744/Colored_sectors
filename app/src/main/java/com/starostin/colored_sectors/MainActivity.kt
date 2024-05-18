package com.starostin.colored_sectors

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var canvasView: CanvasView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        canvasView = findViewById(R.id.canvas_view)

        // Пример установки цветов секторов
        val colors = intArrayOf(Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.CYAN)
        canvasView.setSectorColors(colors)

        // Добавьте здесь кнопку для изменения количества секторов и их цветов
    }
}
