package kr.co.ntek.android.avl.mvppat.contract

import kr.co.ntek.android.avl.mvppat.BasePresenter
import kr.co.ntek.android.avl.mvppat.BaseView
import kr.co.ntek.android.avl.mvppat.model.Items

interface MainContract {

    interface View : BaseView<Presenter>{
        fun showStart()
        fun updateView( items : List<Items>)
    }

    interface Presenter : BasePresenter{
        fun setView(view : View)
        fun loadItem()
    }
}