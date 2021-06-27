FROM alpine:3.14.0
COPY . /consumer
RUN apk update && apk add \
	&& apk add openjdk11 \
	&& apk add maven