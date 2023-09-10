FROM postgres:15.4

# 設定ファイル等必要なものをコピー
COPY ./config/ /etc/postgresql/

# 設定ファイルの権限更新
RUN chmod 644 /etc/postgresql/