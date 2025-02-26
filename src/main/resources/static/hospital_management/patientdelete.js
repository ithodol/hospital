const onDelete = async() => {
    const patientid = new URL(location.href).searchParams.get('patientid')

    const r = await axios.delete(`/patient?patientid=${patientid}`)
    if(r.data == 1) {
        alert('환자 정보 삭제 완료');
        location.href="/hospital_management/patient.html";
    }
}
