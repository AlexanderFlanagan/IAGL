<!DOCTYPE html>
<html>

<head>
    <title>Flight input</title>
</head>

<body>
    <div>
        <h1>
            100% legit british airways website
        </h1>
        <form action="#" th:action="@{/british_airways}" th:object="${inputHandler}" method="POST">
            <label>Departure airport code</label>
            <input type="text" th:field="*{departureAirportCode}" /><br/>
            <label>Arrival airport code</label>
            <input type="text" th:field="*{arrivalAirportCode}" /><br/>
            <label>Departure time</label>
            <input type="text" th:field="*{departureTime}" /><br/>
            <label>Arrival time</label>
            <input type="text" th:field="*{arrivalTime}" /><br/>
            <label>Price points</label>
            <input type="radio" th:field="*{pricePoints}" value="0.8" />20%
            <input type="radio" th:field="*{pricePoints}" value="0.5" />50%
            <input type="radio" th:field="*{pricePoints}" value="0.3" />70%
            <input type="radio" th:field="*{pricePoints}" value="0" />100%
            <label>Currency</label>
            <input type="radio" th:field="*{currency}" value="pound" />pound
            <input type="radio" th:field="*{currency}" value="doller" />doller
            <input type="radio" th:field="*{currency}" value="euro" />euro

            <button type="submit">Book</button>

        </form>

    </div>

</body>

</html>