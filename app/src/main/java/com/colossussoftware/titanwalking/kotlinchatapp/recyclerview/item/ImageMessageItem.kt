package com.colossussoftware.titanwalking.kotlinchatapp.recyclerview.item

import android.content.Context
import com.colossussoftware.titanwalking.kotlinchatapp.R
import com.colossussoftware.titanwalking.kotlinchatapp.glide.GlideApp
import com.colossussoftware.titanwalking.kotlinchatapp.model.ImageMessage
import com.colossussoftware.titanwalking.kotlinchatapp.util.StorageUtil
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.item_imagemessage.*

class ImageMessageItem(val message : ImageMessage, val context : Context) : MessageItem(message){

    override fun getLayout() = R.layout.item_imagemessage

    override fun bind(viewHolder: ViewHolder, position: Int) {
        super.bind(viewHolder, position)

        GlideApp.with(context)
                .load(StorageUtil.pathToReference(message.imagePath))
                .placeholder(R.drawable.ic_image_black_24dp)
                .into(viewHolder.imageView_message_image)
    }

    override fun isSameAs(other: com.xwray.groupie.Item<*>?): Boolean {
        if (other !is ImageMessageItem)
            return false
        if (this.message != other.message)
            return false
        return true
    }

    override fun equals(other: Any?): Boolean {
        return isSameAs(other as? ImageMessageItem)
    }

}