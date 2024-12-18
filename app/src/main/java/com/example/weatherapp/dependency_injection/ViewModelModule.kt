package com.example.weatherapp.dependency_injection

import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.weatherapp.fragments.home.HomeViewModel
import com.example.weatherapp.fragments.location.LocationViewModel
import com.example.weatherapp.network.repository.WeatherDataRepository
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
   viewModel { HomeViewModel(weatherDataRepository = get()) }
   viewModel { LocationViewModel(weatherDataRepository = get()) }
}