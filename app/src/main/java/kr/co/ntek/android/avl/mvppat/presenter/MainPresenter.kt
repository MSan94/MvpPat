package kr.co.ntek.android.avl.mvppat.presenter

import kr.co.ntek.android.avl.mvppat.contract.MainContract
import kr.co.ntek.android.avl.mvppat.model.Items

class MainPresenter : MainContract.Presenter {

    // 왜 private? 찾아야함 ^^
    private var view : MainContract.View? = null

    override fun setView(view: MainContract.View) {
        this.view = view
    }

    override fun loadItem() {
        val list = ArrayList<Items>()
        view?.updateView(list)
    }

    override fun start() {
    }


}