CREATE TABLE boards (
  id serial PRIMARY KEY,
  code varchar(3) NOT NULL UNIQUE,
  title varchar(50) NOT NULL,
  is_hidden boolean NOT NULL DEFAULT false 
);

CREATE TABLE threads (
  id serial PRIMARY KEY,
  board_id integer NOT NULL REFERENCES boards(id) ON DELETE CASCADE,
  date timestamp with time zone NOT NULL DEFAULT NOW(),
  bumped timestamp with time zone NOT NULL DEFAULT NOW(),
  post_count integer NOT NULL DEFAULT 1,
  hide_count integer NOT NULL DEFAULT 0
);

CREATE TABLE posts (
  id serial PRIMARY KEY,
  thread_id integer NOT NULL REFERENCES threads(id) ON DELETE CASCADE,
  name varchar(25),
  title varchar(50),
  message varchar(500) NOT NULL,
  date timestamp with time zone NOT NULL DEFAULT NOW(),
  ip inet NOT NULL,
  hash varchar(32),
  num integer NOT NULL DEFAULT 1,
  is_deleted boolean NOT NULL DEFAULT false,
  pwd varchar(32),
  rate smallint NOT NULL DEFAULT 0
);

CREATE TABLE bans (
  id serial PRIMARY KEY,
  ip inet NOT NULL,
  hash varchar(32),
  reason varchar(50),
  expire timestamp with time zone
);
