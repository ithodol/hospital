const onSave = () => {
    const name = document.querySelector('.name').value;
    const specialty = document.querySelector('.specialty').value;
    const phone = document.querySelector('.phone').value;

    const obj = {name, specialty, phone};
    axios.post('/doctor', obj)
        .then(r => {
            alert('의사 등록 성공');
            location.href = '/hospital_management/doctor.html';
        })
        .catch(e => {console.error(e);})
}