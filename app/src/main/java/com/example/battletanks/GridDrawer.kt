package com.example.battletanks

import android.content.Context
import android.widget.FrameLayout
import android.graphics.Color
import android.view.View

class GridDrawer(private val context: Context)
{
    fun drawGrid()
    {
        val container = binding.container
        drawHorizontalLines(container)
        drawVerticalLines(container)
    }

    private fun drawVerticalLines(container: FrameLayout)
    {
        var leftMargin = 0
        while (leftMargin <= container!!.width)
        {
            val verticalLine = View(context)
            val layoutParams = FrameLayout.LayoutParams (1, FrameLayout.LayoutParams.MATCH_PARENT)
            leftMargin += CELL_SIZE
            layoutParams.leftMargin = leftMargin
            verticalLine.layoutParams = layoutParams
            verticalLine.setBackgroundColor(Color.WHITE)
            container.addView(verticalLine)
        }

    }

    private fun drawHorizontalLines(container: FrameLayout)
    {
        var topMargin = 0
        while (topMargin <= container!!.height)
        {
            val horizontalLine = View(context)
            val layoutParams = FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, 1)
            topMargin += CELL_SIZE
            layoutParams.topMargin = topMargin
            horizontalLine.layoutParams= layoutParams
            horizontalLine.setBackgroundColor(Color.WHITE)
            container.addView(horizontalLine)
        }
    }
}