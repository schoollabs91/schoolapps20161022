CREATE TABLE S_TEACHER 
(
  T_ID VARCHAR2(20 BYTE) NOT NULL 
, T_F_NAME VARCHAR2(50 BYTE) 
, T_L_NAME VARCHAR2(50 BYTE) 
, T_M_NAME VARCHAR2(50 BYTE) 
, T_GENDER VARCHAR2(1 BYTE) 
, T_NATIONALITY VARCHAR2(50 BYTE) 
, T_DOB DATE 
, T_E_QUAL VARCHAR2(100 BYTE) 
, T_PHOTO BLOB 
, T_EXP VARCHAR2(400 BYTE) 
, T_ADDRESS_LINE1 VARCHAR2(50 BYTE) 
, T_ADDRESS_LINE2 VARCHAR2(50 BYTE) 
, T_ADDRESS_LINE3 VARCHAR2(50 BYTE) 
, T_CITY VARCHAR2(20 BYTE) 
, T_STATE VARCHAR2(20 BYTE) 
, T_PIN VARCHAR2(20 BYTE) 
, T_COUNTRY VARCHAR2(20 BYTE) 
, T_PHONE_NO VARCHAR2(20 BYTE) 
, T_MARITAL_STATUS VARCHAR2(1 BYTE) 
, CONSTRAINT S_TEACHER_PK PRIMARY KEY 
  (
    T_ID 
  )
  USING INDEX 
  (
      CREATE UNIQUE INDEX S_TEACHER_PK ON S_TEACHER (T_ID ASC) 
      LOGGING 
      TABLESPACE SYSTEM 
      PCTFREE 10 
      INITRANS 2 
      STORAGE 
      ( 
        INITIAL 65536 
        NEXT 1048576 
        MINEXTENTS 1 
        MAXEXTENTS UNLIMITED 
        FREELISTS 1 
        FREELIST GROUPS 1 
        BUFFER_POOL DEFAULT 
      ) 
      NOPARALLEL 
  )
  ENABLE 
) 
LOGGING 
TABLESPACE SYSTEM 
PCTFREE 10 
PCTUSED 40 
INITRANS 1 
STORAGE 
( 
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1 
  MAXEXTENTS UNLIMITED 
  FREELISTS 1 
  FREELIST GROUPS 1 
  BUFFER_POOL DEFAULT 
) 
NOCOMPRESS 
LOB (T_PHOTO) STORE AS SYS_LOB0000026516C00009$$ 
( 
  ENABLE STORAGE IN ROW 
  CHUNK 8192 
  RETENTION 
  NOCACHE 
  LOGGING 
  TABLESPACE SYSTEM 
  STORAGE 
  ( 
    INITIAL 65536 
    NEXT 1048576 
    MINEXTENTS 1 
    MAXEXTENTS UNLIMITED 
    FREELISTS 1 
    FREELIST GROUPS 1 
    BUFFER_POOL DEFAULT 
  )  
);
