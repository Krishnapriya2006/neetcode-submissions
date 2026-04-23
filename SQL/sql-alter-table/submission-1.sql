CREATE TABLE books (
  isbn INTEGER,
  title TEXT,
  author TEXT,
  published_year integer
);
alter table books drop column author;
-- Do not modify above this line --











-- Do not modify below this line --
SELECT column_name, data_type, column_default
FROM information_schema.columns
WHERE table_name = 'books'
ORDER BY column_name;
