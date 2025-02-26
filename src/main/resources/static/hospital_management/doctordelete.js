const onDelete = async() => {
    const doctorid = new URL(location.href).searchParams.get('doctorid')

    const r = await axios.delete(`/doctor?doctorid=${doctorid}`)
    if(r.data == 1) {
        alert('의사 정보 삭제 완료');
        location.href="/hospital_management/doctor.html";
    }
}