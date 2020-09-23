package com.raywenderlich.placebook.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/raywenderlich/placebook/ui/PhotoOptionDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "listener", "Lcom/raywenderlich/placebook/ui/PhotoOptionDialogFragment$PhotoOptionDialogListener;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "PhotoOptionDialogListener", "app_debug"})
public final class PhotoOptionDialogFragment extends androidx.fragment.app.DialogFragment {
    private com.raywenderlich.placebook.ui.PhotoOptionDialogFragment.PhotoOptionDialogListener listener;
    public static final com.raywenderlich.placebook.ui.PhotoOptionDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public PhotoOptionDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/raywenderlich/placebook/ui/PhotoOptionDialogFragment$PhotoOptionDialogListener;", "", "onCaptureClick", "", "onPickClick", "app_debug"})
    public static abstract interface PhotoOptionDialogListener {
        
        public abstract void onCaptureClick();
        
        public abstract void onPickClick();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\n"}, d2 = {"Lcom/raywenderlich/placebook/ui/PhotoOptionDialogFragment$Companion;", "", "()V", "canCapture", "", "context", "Landroid/content/Context;", "canPick", "newInstance", "Lcom/raywenderlich/placebook/ui/PhotoOptionDialogFragment;", "app_debug"})
    public static final class Companion {
        
        public final boolean canPick(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
        
        public final boolean canCapture(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.raywenderlich.placebook.ui.PhotoOptionDialogFragment newInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}