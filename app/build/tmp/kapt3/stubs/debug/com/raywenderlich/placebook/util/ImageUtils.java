package com.raywenderlich.placebook.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J(\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0010J\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0010J \u0010\u0019\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0010H\u0002\u00a8\u0006\u001c"}, d2 = {"Lcom/raywenderlich/placebook/util/ImageUtils;", "", "()V", "calculateInSampleSize", "", "width", "height", "reqWidth", "reqHeight", "createUniqueImageFile", "Ljava/io/File;", "context", "Landroid/content/Context;", "decodeFileToSize", "Landroid/graphics/Bitmap;", "filePath", "", "decodeUriStreamToSize", "uri", "Landroid/net/Uri;", "loadBitmapFromFile", "filename", "saveBitmapToFile", "", "bitmap", "saveBytesToFile", "bytes", "", "app_debug"})
public final class ImageUtils {
    public static final com.raywenderlich.placebook.util.ImageUtils INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File createUniqueImageFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context) throws java.io.IOException {
        return null;
    }
    
    public final void saveBitmapToFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    java.lang.String filename) {
    }
    
    private final void saveBytesToFile(android.content.Context context, byte[] bytes, java.lang.String filename) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap loadBitmapFromFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String filename) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap decodeFileToSize(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath, int width, int height) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap decodeUriStreamToSize(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, int width, int height, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final int calculateInSampleSize(int width, int height, int reqWidth, int reqHeight) {
        return 0;
    }
    
    private ImageUtils() {
        super();
    }
}