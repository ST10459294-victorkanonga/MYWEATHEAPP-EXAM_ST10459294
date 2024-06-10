package com.example.myweatherappvv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class WeeklyWeatherFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: WeatherAdapter

    // Weekly weather data
    private val weeklyWeatherData = arrayOf(
        WeatherDay("Monday", 12, 25, "Sunny"),
        WeatherDay("Tuesday", 15, 29, "Sunny"),
        WeatherDay("Wednesday", -1, -1, "Unknown"),
        WeatherDay("Thursday", -1, -1, "Unknown"),
        WeatherDay("Friday", -1, -1, "Unknown"),
        WeatherDay("Saturday", 10, 18, "Raining"),
        WeatherDay("Sunday", 10, 16, "Cold")
    )
    )
