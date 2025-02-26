const onSave = () => {
    const name = document.querySelector('.name').value;
    const birthdate = document.querySelector('.birthdate').value;
    const phone = document.querySelector('.phone').value;
    const address = document.querySelector('.address').value;

    const obj = {name, birthdate, phone, address};
    axios.post('/patient', obj)
        .then(r => {
            alert('환자 등록 성공');
            location.href = '/hospital_management/patient.html';
        })
        .catch(e => {console.error(e);})
}