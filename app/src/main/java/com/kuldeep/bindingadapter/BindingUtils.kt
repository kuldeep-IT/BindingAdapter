package com.kuldeep.bindingadapter

import android.text.TextUtils
import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.signature.ObjectKey

class BindingUtils {

    companion object{

        @BindingAdapter("imageUrl", "isCircle", requireAll = false)
        @JvmStatic
        fun ImageView.setImageUrl(
          /*  imageView: ImageView,*/
            url: String?,
            circle: Boolean
        ){
            Glide.with(this.context).load(url).into(this)
            Log.d("IMAGE_URL", url+"")
        }
          /*  val context = imageView.context
            val options = RequestOptions().apply {
                if (circle) {
                    circleCrop()
                        .diskCacheStrategy(DiskCacheStrategy.NONE)
                        .skipMemoryCache(true)
                        .placeholder(R.color.colorGray)
                        .error(R.color.colorGray)
                } else {
                    diskCacheStrategy(DiskCacheStrategy.RESOURCE)
                        .placeholder(R.color.colorGray)
                        .error(R.color.colorGray)
                        .signature(ObjectKey(System.currentTimeMillis().toString()))
                }
            }
            if (!TextUtils.isEmpty(url) *//*&& url!!.startsWith("http")*//*) {
                Glide.with(context).load(url).apply(options).into(imageView)
            }
        }*/

    }

}