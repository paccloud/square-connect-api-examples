# README

The root page has the selections for the different implementations.

Ruby version: 2.3.6

Rails version: 4.2.7

To get the app running:

* Run bundler

```
bundle install
bundle exec rake db:create db:migrate # (No db in example, but keeps rails from complaining)
```

* Add a .env file at the root with following values:

```
SQUARE_APPLICATION_ID=your-app-id
SQUARE_ACCESS_TOKEN=your-access-token
SQUARE_LOCATION_ID=your-location-id
```

* Run Foreman: `bundle exec foreman start`

* The application runs in `http://localhost:3000/`

* [Testing using the API sandbox](https://docs.connect.squareup.com/articles/using-sandbox)
