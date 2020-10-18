/* eslint-disable linebreak-style */
/* eslint-disable max-len */

const token = '.env';

// penguin start
// const elemIsVisible = document.querySelector(".wrapper").offsetHeight;
// penguin stop

const weatherContainer = document.querySelector('.flex_item_weather_picture');
const weatherInstruments = document.querySelector('.flex_item_instruments');
const mainHead = document.querySelector('.main__title');
const cityInfo = document.querySelector('.city-info');
const searchBtn = document.querySelector('#button-search');
const formData = document.querySelector('.form');
const getCityNameForQuery = document.querySelector('#city__name');
const menuProposedCities = document.querySelector('#menu-proposed-cities');
const labelDivGPSStatus = document.querySelector('.form__elements-gpslabel');
const noDataMessage = 'undefinned';

function resetFormFieldName() {
    formData.reset();
    formData.name.focus();
}

const optionsGeoLocation = {
    enableHighAccuracy: true,
    timeout: 5000,
    maximumAge: 0,
};

function getDivForGeolocationStatusOff() {
    labelDivGPSStatus.classList.add('form__elements-gpslabel--off');
    const dataGPSStatus = document.createTextNode('GPS off');
    labelDivGPSStatus.appendChild(dataGPSStatus);
}

function getDivsForGeolocationStatusOn() {
    labelDivGPSStatus.classList.add('form__elements-gpslabel--on');
    const dataGPSStatus = document.createTextNode('GPS on');
    labelDivGPSStatus.appendChild(dataGPSStatus);
}

function getDivsForCoordinates(d) {
    const labelDivLatitude = document.createElement('div');
    labelDivLatitude.classList.add('city-info__field');
    const nameLabelLatitude = document.createTextNode('Your GPS latitude:');
    labelDivLatitude.appendChild(nameLabelLatitude);

    const theDivLatitude = document.createElement('div');
    theDivLatitude.classList.add('city-info__latitude');
    const dataLatitude = document.createTextNode(`Latitude : ${d.latitude}`);
    theDivLatitude.appendChild(dataLatitude);

    const labelDivLongitude = document.createElement('div');
    labelDivLongitude.classList.add('city-info__field');
    const nameLabelLongitude = document.createTextNode('Your GPS longitude:');
    labelDivLongitude.appendChild(nameLabelLongitude);

    const theDivLongitude = document.createElement('div');
    theDivLongitude.classList.add('city-info__longitude');
    const dataLongitude = document.createTextNode(`Longitude : ${d.longitude}`);
    theDivLongitude.appendChild(dataLongitude);

    const labelDivAccuracy = document.createElement('div');
    labelDivAccuracy.classList.add('city-info__field');
    const nameLabelAccuracy = document.createTextNode('Your GPS accuracy:');
    labelDivAccuracy.appendChild(nameLabelAccuracy);

    const theDivAccuracy = document.createElement('div');
    theDivAccuracy.classList.add('city-info__accuracy');
    const dataAccuracy = document.createTextNode(`More or less ${Math.round(d.accuracy)} meters`);
    theDivAccuracy.appendChild(dataAccuracy);

    cityInfo.appendChild(labelDivLatitude);
    cityInfo.appendChild(theDivLatitude);

    cityInfo.appendChild(labelDivLongitude);
    cityInfo.appendChild(theDivLongitude);

    cityInfo.appendChild(labelDivAccuracy);
    cityInfo.appendChild(theDivAccuracy);
}

function successGeoLocation(pos) {
    getDivsForGeolocationStatusOn();
    getDivsForCoordinates(pos.coords);
}

function errorGeoLocation() {
// eslint-disable-next-line no-console
    getDivForGeolocationStatusOff();
// console.warn(`ERROR(${err.code}): ${err.message}`);
}

window.onload = function loadPage() {
    resetFormFieldName();
    formData.name.focus();
    navigator.geolocation.getCurrentPosition(successGeoLocation, errorGeoLocation, optionsGeoLocation);
};

// eslint-disable-next-line no-unused-vars
window.addEventListener('beforeunload', (event) => {
    resetFormFieldName();
});

// eslint-disable-next-line no-unused-vars
window.addEventListener('unload', (event) => {
    resetFormFieldName();
});

// penguin start

/*window.onscroll = function () {
    if (elemIsVisible > 0) {
        document.querySelector(".rocket").classList.add("slide_right");
    }
    window.onscroll = null;
}*/
// penguin end






// eslint-disable-next-line no-undef
// eslint-disable-next-line camelcase
const gauge_pressure = new Gauge({
    renderTo: 'gauge_pressure',
    width: 190,
    height: 190,
    glow: true,
    units: 'mP',
    title: 'Pressure',
    minValue: 970,
    maxValue: 1055,
    majorTicks: ['970', '980', '990', '1000', '1010', '1020', '1030', '1040', '1050'],
    minorTicks: 10,
    strokeTicks: false,
    highlights: [{
        from: 970,
        to: 1005,
        color: 'rgba(0, 0, 255, .3)',
    },
        {
            from: 1006,
            to: 1020,
            color: 'rgba(255, 0, 0, .3)',
        },
        {
            from: 1021,
            to: 1055,
            color: 'rgba(210, 210, 0, .3)',
        },
    ],
    colors: {
        plate: '#f5f5f5',
        majorTicks: '#000',
        minorTicks: '#222',
        title: '#222',
        units: '#666',
        numbers: '#222',
        needle: {
            start: 'rgba(240, 128, 128, 1)',
            end: 'rgba(255, 160, 122, .9)',
        },
    },
    animation: {
        delay: 25,
        duration: 500,
        fn: 'bounce',
    },
});

// eslint-disable-next-line no-undef
// eslint-disable-next-line camelcase
const gauge_temperature = new Gauge({
    renderTo: 'gauge_temperature',
    width: 190,
    height: 190,
    glow: true,
    units: '°C',
    title: 'Temperature',
    minValue: -50,
    maxValue: 50,
    majorTicks: ['-50', '-40', '-30', '-20', '-10', '0', '10', '20', '30', '40', '50'],
    minorTicks: 10,
    strokeTicks: false,
    highlights: [{
        from: -50,
        to: 16,
        color: 'rgba(0, 0, 255, .3)',
    },
        {
            from: 17,
            to: 24,
            color: 'rgba(153, 204, 0, .3)',
        },
        {
            from: 25,
            to: 50,
            color: 'rgba(255, 0, 0, .3)',
        },
    ],
    colors: {
        plate: '#f5f5f5',
        majorTicks: '#000',
        minorTicks: '#222',
        title: '#222',
        units: '#666',
        numbers: '#222',
        needle: {
            start: 'rgba(240, 128, 128, 1)',
            end: 'rgba(255, 160, 122, .9)',
        },
    },
    animation: {
        delay: 25,
        duration: 500,
        fn: 'bounce',
    },
});

// eslint-disable-next-line no-undef
// eslint-disable-next-line camelcase
const gauge_humidity = new Gauge({
    renderTo: 'gauge_humidity',
    width: 190,
    height: 190,
    glow: true,
    units: 'mP',
    title: 'Humidity',
    minValue: 0,
    maxValue: 100,
    majorTicks: ['0', '10', '20', '30', '40', '50', '60', '70', '80', '90', '100'],
    minorTicks: 10,
    strokeTicks: false,
    highlights: [{
        from: 0,
        to: 35,
        color: 'rgba(255, 128, 0, .3)',
    },
        {
            from: 36,
            to: 60,
            color: 'rgba(0, 128, 0, .3)',
        },
        {
            from: 61,
            to: 65,
            color: 'rgba(153, 204, 0, .3)',
        },
        {
            from: 66,
            to: 100,
            color: 'rgba(255, 0, 0, .3)',
        },
    ],
    colors: {
        plate: '#f5f5f5',
        majorTicks: '#000',
        minorTicks: '#222',
        title: '#222',
        units: '#666',
        numbers: '#222',
        needle: {
            start: 'rgba(240, 128, 128, 1)',
            end: 'rgba(255, 160, 122, .9)',
        },
    },
    animation: {
        delay: 25,
        duration: 500,
        fn: 'bounce',
    },
});

function getNeedlePressureColor(d) {
    if (d >= 970 && d <= 1005) {
        const needleColor = '0, 0, 255, .3';
        return needleColor;
    }
    if (d > 1005 && d <= 1020) {
        const needleColor = '255, 0, 0, .3';
        return needleColor;
    }
    if (d > 1020 && d <= 1055) {
        const needleColor = '210, 210, 0, .3';
        return needleColor;
    }
    return false;
}

function getNeedleTemperatureColor(d) {
    if (d >= -50 && d <= 17) {
        const needleColor = '0, 0, 255, .3';
        return needleColor;
    }
    if (d > 17 && d <= 23) {
        const needleColor = '153, 204, 0, .3';
        return needleColor;
    }
    if (d > 23 && d <= 50) {
        const needleColor = '255, 0, 0, .3';
        return needleColor;
    }
    return false;
}

function getNeedleHumidityColor(d) {
    if (d >= 0 && d <= 35) {
        const needleColor = '255, 128, 0, .3';
        return needleColor;
    }
    if (d > 35 && d <= 60) {
        const needleColor = '0, 128, 0, .3';
        return needleColor;
    }
    if (d > 60 && d <= 65) {
        const needleColor = '153, 204, 0, .3';
        return needleColor;
    }
    if (d > 65 && d <= 100) {
        const needleColor = '255, 0, 0, .3';
        return needleColor;
    }
    return false;
}

function City(d) {
    this.name = d || noDataMessage;
}

const city = new City();

function Data(d) {
    this.json = d || 'undefinned';
}

const cityCodes = new Data();
const weatherData = new Data();

function getResultCityName(d) {
    const arr = d.split(',');
    return `${arr[0]}`;
}

function hideMenuProposedCities() {
    menuProposedCities.classList.remove('menu-proposed-cities--visible');
    menuProposedCities.classList.add('menu-proposed-cities');
}

function visualizeData() {
    gauge_pressure.onready = () => {
        setInterval(() => {
            const p = Math.round(weatherData.json[0].Pressure.Metric.Value);
            gauge_pressure.setValue(Math.round(p));
            gauge_pressure.config.colors.needle.start = `rgba(${getNeedlePressureColor(p)})`;
            gauge_pressure.config.colors.needle.end = `rgba(${getNeedlePressureColor(p)})`;
        }, 500);
    };

    gauge_temperature.onready = () => {
        setInterval(() => {
            const t = Math.round(weatherData.json[0].ApparentTemperature.Metric.Value);
            gauge_temperature.setValue(t);
            gauge_temperature.config.colors.needle.start = `rgba(${getNeedleTemperatureColor(t)})`;
            gauge_temperature.config.colors.needle.end = `rgba(${getNeedleTemperatureColor(t)})`;
        }, 500);
    };

    gauge_humidity.onready = () => {
        setInterval(() => {
            const h = Math.round(weatherData.json[0].RelativeHumidity);
            gauge_humidity.setValue(h);
            gauge_humidity.config.colors.needle.start = `rgba(${getNeedleHumidityColor(h)})`;
            gauge_humidity.config.colors.needle.end = `rgba(${getNeedleHumidityColor(h)})`;
        }, 500);
    };

    gauge_temperature.draw();
    gauge_pressure.draw();
    gauge_humidity.draw();
}

function showData(d) {
    hideMenuProposedCities();
    visualizeData();
    formData.name.value = getResultCityName(d);

    formData.addEventListener('click', () => {
        if (city.name !== 'undefinned') {
            resetFormFieldName();
        }
    });

    const cityNameAndCountyCode = getArrCityNameWithEachCountyCode(d);
    weatherContainer.querySelector('.content_weather_city').innerText = cityNameAndCountyCode;
    cityInfo.querySelector('.city-info__name').textContent = cityNameAndCountyCode;
    cityInfo.querySelector('.city-info__temp').textContent = `${weatherData.json[0].ApparentTemperature.Metric.Value} \xB0C`;
    cityInfo.querySelector('.city-info__temp_min').textContent = `${weatherData.json[0].TemperatureSummary.Past6HourRange.Minimum.Metric.Value} \xB0C`;
    cityInfo.querySelector('.city-info__temp_max').textContent = `${weatherData.json[0].TemperatureSummary.Past6HourRange.Maximum.Metric.Value} \xB0C`;
    cityInfo.querySelector('.city-info__pressure').textContent = `${weatherData.json[0].Pressure.Metric.Value} mb`;
    cityInfo.querySelector('.city-info__humidity').textContent = `${weatherData.json[0].RelativeHumidity} %`;
    mainHead.classList.add('main__title--visible');
    cityInfo.classList.add('city-info--visible');
    showInstrumentArrow();
}

function removeProposedListOfCities() {
    if (menuProposedCities.childElementCount) {
        menuProposedCities.removeChild(menuProposedCities.childNodes[1]);
    }
}

menuProposedCities.addEventListener('click', function () {
    getTheWeather(event.target.firstChild.parentElement.attributes.title.value, event.target.firstChild.parentElement.textContent)
        .then(function (arr) {
            weatherData.json = JSON.parse(arr[0]);
            showData(arr[1]);
        })
        .catch(function (err) {
            weatherData.json = err;
            showWarning();
        });
});

function showWarning() {
    // eslint-disable-next-line no-alert
    alert('Please enter a valid city name!');
    resetFormFieldName();
}

function showInstrumentArrow() {
    weatherInstruments.classList.add('flex_item_instruments--visible');
}

function getArrCityNameWithEachCountyCode(d) {
    const arr = d.split(',');
    return arr.length > 1 ? `${arr[0]}, ${arr[arr.length - 1]}` : `${arr[0]}`;
}

function showProposedListOfCities(a) {
    const menuBody = document.createElement('div');
    menuBody.classList.add('menu-body');
    const menuItems = document.createElement('ul');
    menuItems.classList.add('menu-items');

    for (let i = 0; i < a.length; i += 1) {
        const menuItem = document.createElement('li');
        const anchorForProposedCity = document.createElement('a');
        const anchorText = document.createTextNode(`${a[i].localizedName}, ${a[i].administrativeArea.LocalizedName}, ${a[i].country.LocalizedName}, ${a[i].country.ID}`);
        anchorForProposedCity.appendChild(anchorText);
        anchorForProposedCity.title = `${a[i].key}`;
        anchorForProposedCity.href = '#';
        menuItem.appendChild(anchorForProposedCity);
        menuItems.appendChild(menuItem);
    }
    menuBody.appendChild(menuItems);
    menuProposedCities.appendChild(menuBody);
    menuProposedCities.classList.remove('menu-proposed-cities');
    menuProposedCities.classList.add('menu-proposed-cities--visible');
}

function getListOfProposedCityNames() {
    return new Promise(function (resolve, reject) {
        const xhr = new XMLHttpRequest();
        xhr.open(
            'GET',
            `https://dataservice.accuweather.com/locations/v1/cities/autocomplete?apikey=${token}&q=${city.name}&language=en-us&details=false`,
            true,
        );
        xhr.onload = function () {
            if (xhr.status == 200) {
                resolve(xhr.responseText);
            } else {
                reject(Error(xhr.statusText));
            }
        };
        xhr.onerror = function () {
            reject(Error('Network Error'));
        };
        xhr.send();
    });
}

function makeArrForCityCodes(d) {
    const arr = [];
    for (let i = 0; i < d.length; i += 1) {
        arr.push({
            administrativeArea: d[i].AdministrativeArea,
            country: d[i].Country,
            key: d[i].Key,
            localizedName: d[i].LocalizedName,
            rank: d[i].Rank,
            type: d[i].Type,
        });
    }
    return arr;
}

getCityNameForQuery.addEventListener('keyup', function () {
    removeProposedListOfCities();
    if (getCityNameForQuery.value.length > 1) {
        city.name = getCityNameForQuery.value;
        getListOfProposedCityNames()
            .then(function (response) {
                cityCodes.json = JSON.parse(response);
                showProposedListOfCities(makeArrForCityCodes(cityCodes.json));
            })
            .catch(function (err) {
                cityCodes.json = err;
                showWarning();
            });
    }
});

function getTheWeather(c, n) {
    return new Promise(function (resolve, reject) {
        const xhr = new XMLHttpRequest();
        xhr.open(
            'GET',
            `https://dataservice.accuweather.com/currentconditions/v1/${c}?apikey=${token}&language=ru-ru&details=true`,
            true,
        );
        xhr.onload = function () {
            if (xhr.status == 200) {
                resolve([xhr.responseText, n]);
            } else {
                reject(Error(xhr.statusText));
            }
        };
        xhr.onerror = function () {
            reject(Error('Network Error'));
        };
        xhr.send();
    });
}

function getCityCodeForCityName() {
    return new Promise(function (resolve, reject) {
        const xhr = new XMLHttpRequest();
        xhr.open(
            'GET',
            `https://dataservice.accuweather.com/locations/v1/cities/autocomplete?apikey=${token}&q=${city.name}&language=en-us&details=false`,
            true,
        );
        xhr.onload = function () {
            if (xhr.status == 200) {
                resolve(xhr.responseText);
            } else {
                reject(Error(xhr.statusText));
            }
        };
        xhr.onerror = function () {
            reject(Error('Network Error'));
        };
        xhr.send();
    });
}

function getCityDataFromInput() {
    return (formData.name.value > 1 ? city.name = formData.name.value : resetFormFieldName());
}

searchBtn.addEventListener('click', function () {


    // penguin show! here


    getCityDataFromInput();
    getCityCodeForCityName()
        .then(function (response) {
            if ([] !== response) {
                return JSON.parse(response);
            }
        })
        .then(function (codes) {
            cityCodes.json = codes;
            const arr = makeArrForCityCodes(cityCodes.json);
            return getTheWeather(arr[0].key, city.name)
        })
        .then(function (response) {
            weatherData.json = JSON.parse(response[0]);
            showData(response[1]);
        })
        .catch(function (err) {
            cityCodes.json = err;
            showWarning();
        });
});


// ...