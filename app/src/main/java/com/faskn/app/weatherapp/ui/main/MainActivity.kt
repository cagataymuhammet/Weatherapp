package com.faskn.app.weatherapp.ui.main

import android.os.Bundle
import com.faskn.app.weatherapp.R
import com.faskn.app.weatherapp.core.BaseActivity
import com.faskn.app.weatherapp.databinding.ActivityMainBinding
import com.faskn.app.weatherapp.domain.usecase.ForecastUseCase

class MainActivity : BaseActivity<MainActivityViewModel, ActivityMainBinding>(MainActivityViewModel::class.java) {

    override fun initViewModel(viewModel: MainActivityViewModel) {
        binding.viewModel = viewModel
    }

    override fun getLayoutRes() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.getForecast(ForecastUseCase.ForecastParams("Istanbul,TR"))
    }
}
