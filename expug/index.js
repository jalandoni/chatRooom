const express = require('express');
const app = express();
var fs = require('fs');
app.set('view engine', 'pug');

app.set('views', 'views');


app.get('/province/:prov', (req, res) => {
  fs.readFile('event.json', function (err, data) {
    if (err) {
      console.log('Error: ' + err);
      return;
    }

    var dataretrieved = JSON.parse(data);
    res.render('index',dataretrieved);
    console.log(dataretrieved.Province);
  });
});

app.get('/', (req, res) => {
  res.render('index');
});

app.listen(3000, () => {
  console.log('Listening on port 3000...');
});