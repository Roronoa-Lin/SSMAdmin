beforeEach ->
  placeholder = $('<div id="graph" style="width: 600px; height: 400px"></div>')
  $('#TestDao').append(placeholder)

afterEach ->
  $('#TestDao').empty()
