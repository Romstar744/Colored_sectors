package com.starostin.colored_sectors

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import java.lang.Math.min
import java.util.*

class CanvasView(context: Context) : View(context) {
    private val paint = Paint()
    private var sectorColors: Array<Int>? = null
    private var sectorsCount = 0

    fun setSectorColors(colors: IntArray) {
        this.sectorColors = colors
        this.sectorsCount = colors.size
        invalidate() // Обновляем Canvas
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val centerX = width / 2f
        val centerY = height / 2f
        val radius = min(centerX, centerY)

        val angleStep = 360f / sectorsCount
        for (i in 0 until sectorsCount) {
            val color = sectorColors?.getOrNull(i)?: Color.BLACK // Используем черный цвет по умолчанию
            paint.color = color
            val startAngle = i * angleStep - 90 // Начинаем с 90 градусов против часовой стрелки
            val sweepAngle = angleStep
            canvas.drawArc(centerX, centerY, radius.toFloat(), radius.toFloat(), startAngle, sweepAngle, true, paint)
        }
    }
}
