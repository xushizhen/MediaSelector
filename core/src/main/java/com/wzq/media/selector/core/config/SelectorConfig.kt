package com.wzq.media.selector.core.config

import android.os.Parcel
import android.os.Parcelable

/**
 * create by wzq on 2020/7/15
 * 常用配置
 * @property limit 最大可选
 * @property needPreview 是否可预览
 * @property needPreview 是否支持拍照
 */
data class SelectorConfig(
    val limit: Int = 1,
    val needPreview: Boolean = true,
    val needTakePhoto: Boolean = true,
    val needOrigin: Boolean = true
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readByte() != 0.toByte(),
        parcel.readByte() != 0.toByte(),
        parcel.readByte() != 0.toByte()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(limit)
        parcel.writeByte(if (needPreview) 1 else 0)
        parcel.writeByte(if (needTakePhoto) 1 else 0)
        parcel.writeByte(if (needOrigin) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SelectorConfig> {
        override fun createFromParcel(parcel: Parcel): SelectorConfig {
            return SelectorConfig(parcel)
        }

        override fun newArray(size: Int): Array<SelectorConfig?> {
            return arrayOfNulls(size)
        }
    }

}