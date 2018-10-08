// In this main file the data table is constructed
var DATA_TABLE;
var BASE_URL = "/api/airplanes/";

var DATA_PAIRS = {
    planeIdentification: ".planeidentification",
    isFlying: ".flying",
    amountOfKerosene: ".kerosene",
    cruiseSpeed: ".speed"
};

$(function() {
    DATA_TABLE = $("table").DataTable({
        columns: [
            {data: "id"},
            {data: "flying"},
            {data: "planeidentification"},
            {data: "kerosene"},
            {data: "speed"},
        ]
    });
});

}