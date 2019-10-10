# Modus Create Budgeting - Test Plan

## Prerequisites

Make sure the app list is empty. No entries are expected to be displayed

## Positive scenarios

1. Add a new entry **Misc** with **Description** `The usual weekly run` and **Value** `-100`. **Expected result** The entry is successfully added and the entered data is displayed
2. Add a new entry **Groceries** with **Description** `Trader Joe's food` and **Value** `-50.5`. **Expected result** The entry is successfully added and the entered data is displayed
3. Add a new entry **Groceries** with **Description** `Walmart` and **Value** `-50.123`. **Expected result** The entry is successfully added and the entered data is displayed with **Value** rounded to `-50.12`
4. Add a new entry **Income** with **Description** `Paycheck` and **Value** `30000`. **Expected result** The entry is successfully added and the entered data is displayed

add a new entry misc `the usual weekly run` 100
add a new entry groceries `trader joe`s food` -50.5
add a new entry grocerie `walmart` -50
add a new entry entertainment `wedding anniversary` -15000

select `wedding anniversary` edit category to misc click cancel
select `wedding anniversary` edit category to misc and sum to -20000 click update
check reports tab both tabs
select `wedding anniversary` delete category

negative
insert lorem ipsum in description
insert a lot of 9999999 in value
insert a lot of .99999999 in value

insert a value with +
