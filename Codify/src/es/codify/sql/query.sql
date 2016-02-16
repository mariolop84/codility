SELECT
    D.DEPT_ID, S.num_emp, S.sum_sal
FROM
    GMS_OWN.department D,
    (
        SELECT
            dept_id,
            COUNT(dept_id) as num_emp,
            SUM(salary) as sum_sal
        FROM
            GMS_OWN.EMPLOYEE
        GROUP BY
            DEPT_ID
    ) S
WHERE
    D.DEPT_ID = S.DEPT_ID
ORDER BY
    D.DEPT_ID