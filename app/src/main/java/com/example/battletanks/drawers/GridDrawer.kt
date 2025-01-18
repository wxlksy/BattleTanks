package com.example.battletanks.drawers

//import android.content.Context
import android.widget.FrameLayout
import android.graphics.Color
import android.view.View
import com.example.battletanks.CELL_SIZE
//import com.example.battletanks.binding

class GridDrawer(private val container: FrameLayout)
{
    private val allLines = mutableListOf<View>()
    fun removeGrid()
    {

        allLines.forEach{
            container.removeView(it)
        }
    }

    fun drawGrid()
    {

        drawHorizontalLines(container)
        drawVerticalLines(container)
    }

    private fun drawVerticalLines(container: FrameLayout)
    {
        var leftMargin = 0
        while (leftMargin <= container!!.width)
        {
            val verticalLine = View(container)
            val layoutParams = FrameLayout.LayoutParams (1, FrameLayout.LayoutParams.MATCH_PARENT)
            leftMargin += CELL_SIZE
            layoutParams.leftMargin = leftMargin
            verticalLine.layoutParams = layoutParams
            verticalLine.setBackgroundColor(Color.WHITE)
            allLines.add(verticalLine)
            container.addView(verticalLine)
        }

    }

    private fun drawHorizontalLines(container: FrameLayout)
    {
        var topMargin = 0
        while (topMargin <= container!!.height)
        {
            val horizontalLine = View(container)
            val layoutParams = FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, 1)
            topMargin += CELL_SIZE
            layoutParams.topMargin = topMargin
            horizontalLine.layoutParams= layoutParams
            horizontalLine.setBackgroundColor(Color.WHITE)
            allLines.add(horizontalLine)
            container.addView(horizontalLine)
        }
    }
}