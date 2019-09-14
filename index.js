var app = require('express')();
var http = require('http').Server(app);
var io = require('socket.io')(http);
var port = process.env.PORT || 3000;

app.get('/', function(req, res){
  res.sendFile(__dirname + '/index.html');
});

io.sockets.on('connection', function(socket){
  socket.on('username', function(username) {
    socket.username = username;
    io.emit('is_online', '🔵 <i>' + socket.username + ' join the chat..</i>');
});
socket.on('disconnect', function(username) {
  io.emit('is_online', '🔴 <i>' + socket.username + ' left the chat..</i>');
})

  socket.on('chat message', function(msg){
    io.emit('chat message','<strong>' + socket.username + '<strong>:' +  msg);
  });

});


var sever = http.listen(port, function(){
  console.log('listening on *:' + port);
});
