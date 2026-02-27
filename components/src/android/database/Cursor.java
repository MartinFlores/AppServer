package android.database;

public interface Cursor {
    boolean moveToNext();

    int getColumnCount();

    String getColumnName(int i);

    int getType(int i);

    long getLong(int i);

    double getDouble(int i);

    String getString(int i);

    // Constants for types
    int FIELD_TYPE_NULL = 0;
    int FIELD_TYPE_INTEGER = 1;
    int FIELD_TYPE_FLOAT = 2;
    int FIELD_TYPE_STRING = 3;
    int FIELD_TYPE_BLOB = 4;
}
