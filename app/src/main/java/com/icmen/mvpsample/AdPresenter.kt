package com.icmen.mvpsample

import kotlinx.coroutines.*

class AdPresenter(private val view: AdContract.View) : AdContract.Presenter {

    private val adRepository = AdRepository()

    override fun initLogic() {
        view.initViews()
        getAdDetails()
    }

    override fun getAdDetails() {
        GlobalScope.launch {
            view.showLoading()
            val ad = adRepository.getAdDetails()
            withContext(Dispatchers.Main) {
                view.showAd(ad)
                view.hideLoading()
            }
        }
    }
}
