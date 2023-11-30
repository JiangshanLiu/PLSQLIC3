CREATE OR REPLACE FUNCTION test(total_num int, percentage float) RETURNS int AS $$
DECLARE
var_last_award INT;
BEGIN
FOR i IN 1 .. total_num * percentage LOOP
    raise notice 'The % individual will be presented with an award', i;
    var_last_award = i;
END LOOP;
RETURN var_last_award;
END;
$$ LANGUAGE plpgsql;