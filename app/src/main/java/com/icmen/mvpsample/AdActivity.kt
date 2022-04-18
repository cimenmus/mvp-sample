package com.icmen.mvpsample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.icmen.mvpsample.databinding.ActivityAdBinding

class AdActivity : AppCompatActivity(), AdContract.View {

    private lateinit var binding: ActivityAdBinding
    private lateinit var adPresenter: AdContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adPresenter = AdPresenter(view = this)
        adPresenter.initLogic()
    }

    override fun initViews() {
        binding.swipeRefreshLayout.setOnRefreshListener {
            adPresenter.getAdDetails()
        }
    }

    override fun showLoading() {
        binding.swipeRefreshLayout.isRefreshing = true
    }

    override fun hideLoading() {
        binding.swipeRefreshLayout.isRefreshing = false
    }

    override fun showAd(ad: AdModel) {
        binding.adInfoTextView.text = ad.toString()
    }
}
