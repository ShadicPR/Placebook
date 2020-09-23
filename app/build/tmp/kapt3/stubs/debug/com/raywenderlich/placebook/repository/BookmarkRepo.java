package com.raywenderlich.placebook.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\b\u00a2\u0006\u0002\u0010\u001cJ$\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002J$\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\fj\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r`\u000fH\u0002J\u0006\u0010\u001f\u001a\u00020\bJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\bJ\u000e\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u001aJ\u0015\u0010$\u001a\u0004\u0018\u00010\u000e2\u0006\u0010%\u001a\u00020\r\u00a2\u0006\u0002\u0010&J\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010#\u001a\u00020\u001aJ\u000e\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u0016J\u000e\u0010*\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR*\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R*\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\fj\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r`\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/raywenderlich/placebook/repository/BookmarkRepo;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "allBookmarks", "Landroidx/lifecycle/LiveData;", "", "Lcom/raywenderlich/placebook/model/Bookmark;", "getAllBookmarks", "()Landroidx/lifecycle/LiveData;", "allCategories", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "bookmarkDao", "Lcom/raywenderlich/placebook/db/BookmarkDao;", "categories", "getCategories", "()Ljava/util/List;", "categoryMap", "Lcom/google/android/libraries/places/api/model/Place$Type;", "db", "Lcom/raywenderlich/placebook/db/PlaceBookDatabase;", "addBookmark", "", "bookmark", "(Lcom/raywenderlich/placebook/model/Bookmark;)Ljava/lang/Long;", "buildCategories", "buildCategoryMap", "createBookmark", "deleteBookmark", "", "getBookmark", "bookmarkId", "getCategoryResourceId", "placeCategory", "(Ljava/lang/String;)Ljava/lang/Integer;", "getLiveBookmark", "placeTypeToCategory", "placeType", "updateBookmark", "app_debug"})
public final class BookmarkRepo {
    private com.raywenderlich.placebook.db.PlaceBookDatabase db;
    private com.raywenderlich.placebook.db.BookmarkDao bookmarkDao;
    private java.util.HashMap<com.google.android.libraries.places.api.model.Place.Type, java.lang.String> categoryMap;
    private java.util.HashMap<java.lang.String, java.lang.Integer> allCategories;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long addBookmark(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.placebook.model.Bookmark bookmark) {
        return null;
    }
    
    public final void deleteBookmark(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.placebook.model.Bookmark bookmark) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.placebook.model.Bookmark createBookmark() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.placebook.model.Bookmark>> getAllBookmarks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.raywenderlich.placebook.model.Bookmark> getLiveBookmark(long bookmarkId) {
        return null;
    }
    
    public final void updateBookmark(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.placebook.model.Bookmark bookmark) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.placebook.model.Bookmark getBookmark(long bookmarkId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCategoryResourceId(@org.jetbrains.annotations.NotNull()
    java.lang.String placeCategory) {
        return null;
    }
    
    private final java.util.HashMap<com.google.android.libraries.places.api.model.Place.Type, java.lang.String> buildCategoryMap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String placeTypeToCategory(@org.jetbrains.annotations.NotNull()
    com.google.android.libraries.places.api.model.Place.Type placeType) {
        return null;
    }
    
    private final java.util.HashMap<java.lang.String, java.lang.Integer> buildCategories() {
        return null;
    }
    
    public BookmarkRepo(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}