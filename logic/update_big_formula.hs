make_close [x] = if head x == '-' then [('!':'x':tail x)] else [('x':x)]
make_close (x:xs) = ((if head x == '-' 
    then ("(!x":tail x:" || ":make_close xs) 
    else ("(x":x:" || ":make_close xs))) ++ [")"]
make_close [] = []

concat_braces [x] = x
concat_braces (x:xs) = ("(" ++ x ++ concat_braces xs) ++ ")"
concat_braces [] = []

-- Превращает DIMACS без первых строк и нулей в конце в формулу со всеми скобками
-- после преобразования нужно убрать ручками последний &&
main = interact $ concat_braces . map (concat . (++ [" && "]). make_close) . map words . lines