var
X:int64;
i:integer;
begin
   read(X);
   for i := 1 to X do
      if((i mod 2) <> 0)then
         writeln(i);
      i := i + 2
end.
