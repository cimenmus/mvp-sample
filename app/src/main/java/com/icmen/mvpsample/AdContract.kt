package com.icmen.mvpsample

interface AdContract {

    interface View {
        fun showLoading()
        fun hideLoading()
        fun showAd(ad: AdModel)
        fun initViews()
    }

    interface Presenter {
        fun initLogic()
        fun getAdDetails()
    }
}
