# Modus Create Budgeting - Test Plan

## Prerequisites

Make sure the app list is empty. No entries are expected to be displayed

## Positive scenarios

**Budget tab**
1. Add a new entry **Misc** with **Description** `The usual weekly run` and **Value** `-100`. **Expected result** The entry is successfully added and the entered data is displayed
2. Add a new entry **Misc** with **Description** `TV subscription` and **Value** `-99`. **Expected result**. The entry is successfully added and the entered data is displayed
3. Add a new entry **Groceries** with **Description** `Trader Joe's food` and **Value** `-50.5`. **Expected result** The entry is successfully added and the entered data is displayed
4. Add a new entry **Groceries** with **Description** `Walmart` and **Value** `-50.123`. **Expected result** The entry is successfully added and the entered data is displayed with **Value** rounded to `-50.12`
5. Add a new entry **Income** with **Description** `Paycheck` and **Value** `+30000`. **Expected result** The entry is successfully added and the entered data is displayed
6. Add a new entry **Entertainment** with **Description** `Wedding anniversary` and **Value** `15000`. **Expected result** The entry is successfully added and the entered data is displayed
7. Add a new entry **Insurance** with **Description** `House insurance` and **Value** `-100`. **Expected result**. The entry is successfully added and the entered data is displayed
8. Click on the entry `Wedding anniversary`, change **Category** to `Misc` and click the `Cancel` button. The entry is expected to remain unchanged
9. Click on the entry `Wedding anniversary`, change **Value** to `-5000` and click the `Update` button. The entry is expected to change its value
10. Click on the entry `House insurance` and click the `Delete` button. The entry is expected to be successfully deleted

**Reports tab**
11. Select **Inflow vs. Outflow**. **Expected results** The following sums are expected to be displayed: `30,000.00` for Inflow, `5,299.62` for Outflow. By categories `199.00` for **Misc**, `100.62` for **Groceries** and `5,000.00` for **Entertainment**

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
