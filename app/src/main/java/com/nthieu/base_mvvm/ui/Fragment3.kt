package com.nthieu.base_mvvm.ui

/**
 * Aitruck
 * Created by Nguyen Trung Hieu on 1/18/2021.
 * Phone, telegram : 0372.810.001.
 * Email : nthieuhpcntt@gmail.com
 */

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nthieu.base_mvvm.R
import com.nthieu.base_mvvm.base.BaseFragment
import com.nthieu.base_mvvm.databinding.Fragment3Binding
import com.nthieu.base_mvvm.utils.Logger


class Fragment3 : BaseFragment<Fragment3Binding>() {
    final val TAG : String = this.javaClass.simpleName

    override fun layoutId(): Int {
        return R.layout.fragment_3
    }

    override fun onBackPress() {
        super.onBackPress()
        Logger.debug(TAG,"$TAG onBackPress")
    }

}