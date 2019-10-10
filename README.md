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
11. Check the values in the Totals section. **Expected results** `30,000.00` for **Total Inflow**, `5,299.62` for **Total Outflow** and `24,700.38` for **Working Balance**

**Reports tab**

11. Select **Inflow vs. Outflow**. **Expected results** The following sums are expected to be displayed: `30,000.00` for Inflow, `5,299.62` for Outflow. By categories `5,000.00` for **Entertainment**, `100.62` for **Groceries** and `199.00` for **Misc**
12. Select **Spending by Category**. The following sums are expected to be displayed `5,000.00` for **Entertainment**, `100.62` for **Groceries** and `199.00` for **Misc**


## Negative scenarios

**Budget tab**

13. Add a new entry **Misc** with a large text in the **Description** and **Value** `-100`. **Expected result** The entry is successfully added and the entered data is displayed
14. Add a new entry **Income** with **Description** `Other income` and **Value** `1234567891234567891234`. **Expected result** The entry is successfully added and the entered data is displayed
15. Check the values in the Totals section. **Expected results** The sums are expected to be updated with the new values
16. Add a new entry **Income** with **Description** `Other income` and **Value** `1.9999999999999999999`. **Expected result** The entry is successfully added and the entered data is displayed with **Value** rounded to `2`
