FROM mysql:8.0.18
MAINTAINER FELIPE LEITAO<vieira.felipe@gmail.com>
ENV MYSQL_ROOT_PASSWORD=Rr123
ENV MYSQL_USER=root
ENV MYSQL_PASSWORD=Rr123
ADD ./banco.sql /docker-entrypoint-initdb.d
#COPY ./banco.sql /docker-entrypoint-initdb.d/
#RUN mysql -uroot -p${MYSQL_ROOT_PASSWORD} </docker-entrypoint-initdb.d/banco.sql
ADD schema.sql /docker-entrypoint-initdb.d/schema.sql
EXPOSE 3306
CMD ["mysqld"]