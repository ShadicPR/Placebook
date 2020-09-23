package com.raywenderlich.placebook.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\'J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\f\u001a\u00020\u0007H\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/raywenderlich/placebook/db/BookmarkDao;", "", "deleteBookmark", "", "bookmark", "Lcom/raywenderlich/placebook/model/Bookmark;", "insertBookmark", "", "loadAll", "Landroidx/lifecycle/LiveData;", "", "loadBookmark", "bookmarkId", "loadLiveBookmark", "updateBookmark", "app_debug"})
public abstract interface BookmarkDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Bookmark ORDER BY name")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.placebook.model.Bookmark>> loadAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Bookmark WHERE id = :bookmarkId")
    public abstract com.raywenderlich.placebook.model.Bookmark loadBookmark(long bookmarkId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Bookmark WHERE id = :bookmarkId")
    public abstract androidx.lifecycle.LiveData<com.raywenderlich.placebook.model.Bookmark> loadLiveBookmark(long bookmarkId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract long insertBookmark(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.placebook.model.Bookmark bookmark);
    
    @androidx.room.Update(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void updateBookmark(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.placebook.model.Bookmark bookmark);
    
    @androidx.room.Delete()
    public abstract void deleteBookmark(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.placebook.model.Bookmark bookmark);
}