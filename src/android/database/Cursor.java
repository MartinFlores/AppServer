package android.database;

public interface Cursor {
    int FIELD_TYPE_NULL = 0;
    int FIELD_TYPE_INTEGER = 1;
    int FIELD_TYPE_FLOAT = 2;
    int FIELD_TYPE_STRING = 3;
    int FIELD_TYPE_BLOB = 4;

    boolean moveToNext();

    boolean moveToFirst();

    int getColumnCount();

    String getColumnName(int var1);

    int getType(int var1);

    String getString(int var1);

    long getLong(int var1);

    double getDouble(int var1);

    boolean isNull(int var1);

    void close();
}
