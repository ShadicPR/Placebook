package com.raywenderlich.placebook.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.raywenderlich.placebook.model.Bookmark;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BookmarkDao_Impl implements BookmarkDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Bookmark> __insertionAdapterOfBookmark;

  private final EntityDeletionOrUpdateAdapter<Bookmark> __deletionAdapterOfBookmark;

  private final EntityDeletionOrUpdateAdapter<Bookmark> __updateAdapterOfBookmark;

  public BookmarkDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBookmark = new EntityInsertionAdapter<Bookmark>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Bookmark` (`id`,`placeId`,`name`,`address`,`latitude`,`longitude`,`phone`,`notes`,`category`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Bookmark value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getPlaceId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPlaceId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAddress());
        }
        stmt.bindDouble(5, value.getLatitude());
        stmt.bindDouble(6, value.getLongitude());
        if (value.getPhone() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPhone());
        }
        if (value.getNotes() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getNotes());
        }
        if (value.getCategory() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getCategory());
        }
      }
    };
    this.__deletionAdapterOfBookmark = new EntityDeletionOrUpdateAdapter<Bookmark>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Bookmark` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Bookmark value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfBookmark = new EntityDeletionOrUpdateAdapter<Bookmark>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `Bookmark` SET `id` = ?,`placeId` = ?,`name` = ?,`address` = ?,`latitude` = ?,`longitude` = ?,`phone` = ?,`notes` = ?,`category` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Bookmark value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getPlaceId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPlaceId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAddress());
        }
        stmt.bindDouble(5, value.getLatitude());
        stmt.bindDouble(6, value.getLongitude());
        if (value.getPhone() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPhone());
        }
        if (value.getNotes() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getNotes());
        }
        if (value.getCategory() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getCategory());
        }
        if (value.getId() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getId());
        }
      }
    };
  }

  @Override
  public long insertBookmark(final Bookmark bookmark) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfBookmark.insertAndReturnId(bookmark);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteBookmark(final Bookmark bookmark) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfBookmark.handle(bookmark);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateBookmark(final Bookmark bookmark) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfBookmark.handle(bookmark);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Bookmark>> loadAll() {
    final String _sql = "SELECT * FROM Bookmark ORDER BY name";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Bookmark"}, false, new Callable<List<Bookmark>>() {
      @Override
      public List<Bookmark> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPlaceId = CursorUtil.getColumnIndexOrThrow(_cursor, "placeId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final List<Bookmark> _result = new ArrayList<Bookmark>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Bookmark _item;
            final Long _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getLong(_cursorIndexOfId);
            }
            final String _tmpPlaceId;
            _tmpPlaceId = _cursor.getString(_cursorIndexOfPlaceId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final double _tmpLatitude;
            _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
            final double _tmpLongitude;
            _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
            final String _tmpPhone;
            _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            final String _tmpNotes;
            _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            _item = new Bookmark(_tmpId,_tmpPlaceId,_tmpName,_tmpAddress,_tmpLatitude,_tmpLongitude,_tmpPhone,_tmpNotes,_tmpCategory);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Bookmark loadBookmark(final long bookmarkId) {
    final String _sql = "SELECT * FROM Bookmark WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, bookmarkId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfPlaceId = CursorUtil.getColumnIndexOrThrow(_cursor, "placeId");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
      final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
      final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
      final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
      final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
      final Bookmark _result;
      if(_cursor.moveToFirst()) {
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpPlaceId;
        _tmpPlaceId = _cursor.getString(_cursorIndexOfPlaceId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpAddress;
        _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
        final double _tmpLatitude;
        _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
        final double _tmpLongitude;
        _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
        final String _tmpPhone;
        _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
        final String _tmpNotes;
        _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
        final String _tmpCategory;
        _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
        _result = new Bookmark(_tmpId,_tmpPlaceId,_tmpName,_tmpAddress,_tmpLatitude,_tmpLongitude,_tmpPhone,_tmpNotes,_tmpCategory);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<Bookmark> loadLiveBookmark(final long bookmarkId) {
    final String _sql = "SELECT * FROM Bookmark WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, bookmarkId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Bookmark"}, false, new Callable<Bookmark>() {
      @Override
      public Bookmark call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPlaceId = CursorUtil.getColumnIndexOrThrow(_cursor, "placeId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final Bookmark _result;
          if(_cursor.moveToFirst()) {
            final Long _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getLong(_cursorIndexOfId);
            }
            final String _tmpPlaceId;
            _tmpPlaceId = _cursor.getString(_cursorIndexOfPlaceId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final double _tmpLatitude;
            _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
            final double _tmpLongitude;
            _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
            final String _tmpPhone;
            _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            final String _tmpNotes;
            _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            _result = new Bookmark(_tmpId,_tmpPlaceId,_tmpName,_tmpAddress,_tmpLatitude,_tmpLongitude,_tmpPhone,_tmpNotes,_tmpCategory);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
