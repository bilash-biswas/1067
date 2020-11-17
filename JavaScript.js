var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
input = input.replace('\n',' ');
var lines = input.split(' ');
var X = parseInt(lines.shift());
var i;
if(X > 0 && X < 1000)
{
   for(i = 1;i <= X;i++)
   {
       if(i % 2 !== 0)
       {
           console.log(i);
        }
    }
}      
