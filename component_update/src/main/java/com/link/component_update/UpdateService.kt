package com.link.component_update

import android.content.Context
import android.content.Intent
import com.alibaba.android.arouter.facade.annotation.Route
import com.link.component_update.ui.UpdateServiceImpl
import com.link.librarycomponent.router.RouterConstant
import com.link.librarycomponent.service.update.IUpdateService
import com.link.librarymodule.utils.Utils

@Route(path = RouterConstant.UPDATE_SERVICE)
class UpdateService : IUpdateService {

    override fun startUpdateService() {
        val intent = Intent()
        intent.setClass(Utils.getContext(), UpdateServiceImpl::class.java)
        Utils.getContext().startService(intent)
    }

    override fun init(context: Context?) {

    }

}