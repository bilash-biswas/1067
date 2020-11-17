a = gets().chomp().to_i
for i in 1..a
  if i % 2 != 0
    printf("%d\n", i);
  end
end
