CREATE TABLE "tokens" (
  "id"      BIGSERIAL PRIMARY KEY,
  "user_id" BIGINT,
  "token"   VARCHAR NOT NULL,
   FOREIGN KEY(user_id) REFERENCES users(id)
);
