package com.raywenderlich.placebook.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/raywenderlich/placebook/adapter/BookmarkListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/raywenderlich/placebook/adapter/BookmarkListAdapter$ViewHolder;", "bookmarkData", "", "Lcom/raywenderlich/placebook/viewmodel/MapsViewModel$BookmarkView;", "mapsActivity", "Lcom/raywenderlich/placebook/ui/MapsActivity;", "(Ljava/util/List;Lcom/raywenderlich/placebook/ui/MapsActivity;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setBookmarkData", "bookmarks", "ViewHolder", "app_debug"})
public final class BookmarkListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.raywenderlich.placebook.adapter.BookmarkListAdapter.ViewHolder> {
    private java.util.List<com.raywenderlich.placebook.viewmodel.MapsViewModel.BookmarkView> bookmarkData;
    private final com.raywenderlich.placebook.ui.MapsActivity mapsActivity = null;
    
    public final void setBookmarkData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.placebook.viewmodel.MapsViewModel.BookmarkView> bookmarks) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.raywenderlich.placebook.adapter.BookmarkListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.placebook.adapter.BookmarkListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public BookmarkListAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.raywenderlich.placebook.viewmodel.MapsViewModel.BookmarkView> bookmarkData, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.placebook.ui.MapsActivity mapsActivity) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/raywenderlich/placebook/adapter/BookmarkListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "mapsActivity", "Lcom/raywenderlich/placebook/ui/MapsActivity;", "(Landroid/view/View;Lcom/raywenderlich/placebook/ui/MapsActivity;)V", "categoryImageView", "Landroid/widget/ImageView;", "getCategoryImageView", "()Landroid/widget/ImageView;", "nameTextView", "Landroid/widget/TextView;", "getNameTextView", "()Landroid/widget/TextView;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView nameTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView categoryImageView = null;
        private final com.raywenderlich.placebook.ui.MapsActivity mapsActivity = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getNameTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getCategoryImageView() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v, @org.jetbrains.annotations.NotNull()
        com.raywenderlich.placebook.ui.MapsActivity mapsActivity) {
            super(null);
        }
    }
}