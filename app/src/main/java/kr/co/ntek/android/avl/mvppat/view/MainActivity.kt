package kr.co.ntek.android.avl.mvppat.view

import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kr.co.ntek.android.avl.mvppat.contract.MainContract
import kr.co.ntek.android.avl.mvppat.databinding.ActivityMainBinding
import kr.co.ntek.android.avl.mvppat.model.Items
import kr.co.ntek.android.avl.mvppat.presenter.MainPresenter

class MainActivity() : AppCompatActivity() , MainContract.View {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        presenter = MainPresenter()
        presenter.setView(this)
        showStart()
        presenter.loadItem()
    }


    override fun showStart() {
        Toast.makeText(this,"Hello World",Toast.LENGTH_SHORT).show()
    }

    override fun updateView(items: List<Items>) {
    }

}